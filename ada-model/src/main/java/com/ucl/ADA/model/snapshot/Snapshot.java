package com.ucl.ADA.model.snapshot;

import com.ucl.ADA.model.branch.Branch;
import com.ucl.ADA.model.source_file.SourceFile;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SNAPSHOT")
public class Snapshot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "snapshot_id")
    private Long snapshotID;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToMany(mappedBy = "snapshot", targetEntity = SourceFile.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private
    Set<Branch> sourceFiles = new HashSet<>();

    @Column(name = "timestamp")
    private LocalDateTime timestamp;


    public void setSnapshotID(Long snapshotID) {
        this.snapshotID = snapshotID;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void setSourceFiles(Set<Branch> sourceFiles) {
        this.sourceFiles = sourceFiles;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Long getSnapshotID() {
        return snapshotID;
    }

    public Set<Branch> getSourceFiles() {
        return sourceFiles;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Snapshot(){}
}