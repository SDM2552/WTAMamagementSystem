package izo.wtamanagementsystem.service;

import izo.wtamanagementsystem.model.Program;
import izo.wtamanagementsystem.model.ProgramMid;
import izo.wtamanagementsystem.repository.ProgramMidRepository;
import izo.wtamanagementsystem.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramMidService {
    @Autowired
    private ProgramMidRepository programMidRepository;

    public int insertProgram(ProgramMid programMid) {
        int insertProgramMid = programMidRepository.insert(programMid);
        return insertProgramMid;
    }

    public int updateProgram(int programId) {
        int updateProgram = programMidRepository.update(programId);
        return updateProgram;
    }

    public int deleteProgram(int programId) {
        int deleteProgram = programMidRepository.delete(programId);
        return deleteProgram;
    }

}
