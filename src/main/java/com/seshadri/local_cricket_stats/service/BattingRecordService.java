
package com.seshadri.local_cricket_stats.service;

import com.seshadri.local_cricket_stats.entity.BattingRecord;
import com.seshadri.local_cricket_stats.exception.BattingRecordNotFoundException;
import com.seshadri.local_cricket_stats.repository.BattingRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BattingRecordService {

    private final BattingRecordRepository battingRecordRepository;

    public BattingRecordService(
            BattingRecordRepository battingRecordRepository) {
        this.battingRecordRepository = battingRecordRepository;
    }

    public BattingRecord saveRecord(BattingRecord record) {
        return battingRecordRepository.save(record);
    }

    public List<BattingRecord> getAllRecords() {
        return battingRecordRepository.findAll();
    }

    public BattingRecord getRecordById(Integer id) {
        return battingRecordRepository.findById(id)
                .orElseThrow(() ->
                        new BattingRecordNotFoundException(
                                "Batting record not found with id: " + id));
    }

    public BattingRecord updateRecord(
            Integer id,
            BattingRecord updatedRecord) {

        BattingRecord existingRecord = getRecordById(id);

        existingRecord.setPlayerName(updatedRecord.getPlayerName());
        existingRecord.setTeamName(updatedRecord.getTeamName());
        existingRecord.setMatchName(updatedRecord.getMatchName());
        existingRecord.setRunsScored(updatedRecord.getRunsScored());
        existingRecord.setBallsFaced(updatedRecord.getBallsFaced());
        existingRecord.setFours(updatedRecord.getFours());
        existingRecord.setSixes(updatedRecord.getSixes());
        existingRecord.setMatchDate(updatedRecord.getMatchDate());
        existingRecord.setIsOut(updatedRecord.getIsOut());

        return battingRecordRepository.save(existingRecord);
    }

    public String deleteRecord(Integer id) {

        BattingRecord existingRecord = getRecordById(id);

        battingRecordRepository.delete(existingRecord);

        return "Player " + existingRecord.getPlayerName()
                + " deleted successfully.";
    }
}
