package izo.wtamanagementsystem.service;

import izo.wtamanagementsystem.model.Program;
import izo.wtamanagementsystem.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramService {
    @Autowired
    private ProgramRepository programRepository;

    public List<Program> getAllPrograms() {
        List<Program> programs = new ArrayList<>();
        return programs;
    }

    public int insertProgram(Program program) {
        int insertProgram = programRepository.insert(program);
        return insertProgram;
    }

    public int updateProgram(int pgmId) {
        int updateProgram = programRepository.update(pgmId);
        return updateProgram;
    }

    public int deleteProgram(int pgmId) {
        int deleteProgram = programRepository.delete(pgmId);
        return deleteProgram;
    }

}
