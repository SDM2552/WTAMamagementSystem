package izo.wtamamagementsystem.service;

import izo.wtamamagementsystem.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramService {
    @Autowired
    private ProgramRepository programRepository;

}
