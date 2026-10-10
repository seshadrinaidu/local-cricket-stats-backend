package com.seshadri.local_cricket_stats.repository;

import com.seshadri.local_cricket_stats.entity.BattingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattingRecordRepository extends JpaRepository<BattingRecord,Integer> {
    
}
