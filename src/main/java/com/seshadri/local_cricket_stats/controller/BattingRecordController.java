
package com.seshadri.local_cricket_stats.controller;

import com.seshadri.local_cricket_stats.entity.BattingRecord;
import com.seshadri.local_cricket_stats.service.BattingRecordService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://local-cricket-stats-frontend.vercel.app"
})

@RestController
@RequestMapping("/api/batting-records")
public class BattingRecordController {

    private final BattingRecordService battingRecordService;

    public BattingRecordController(
            BattingRecordService battingRecordService) {
        this.battingRecordService = battingRecordService;
    }

    @PostMapping
    public BattingRecord createRecord(
            @Valid @RequestBody BattingRecord record) {

        return battingRecordService.saveRecord(record);
    }

    @GetMapping
    public List<BattingRecord> getAllRecords() {
        return battingRecordService.getAllRecords();
    }

    @GetMapping("/{id}")
    public BattingRecord getRecordById(
            @PathVariable Integer id) {

        return battingRecordService.getRecordById(id);
    }

    @PutMapping("/{id}")
    public BattingRecord updateRecord(
            @PathVariable Integer id,
            @Valid @RequestBody BattingRecord updatedRecord) {

        return battingRecordService.updateRecord(id, updatedRecord);
    }

    @DeleteMapping("/{id}")
    public String deleteRecord(
            @PathVariable Integer id) {

        return battingRecordService.deleteRecord(id);
    }
}
