package com.jobwebapp.dto;

import com.jobwebapp.entity.Employer;
import org.modelmapper.ModelMapper;

public class ConverterDTO {

    public static EmployerDto convert(Employer employer){

        ModelMapper modelMapper = new ModelMapper();
        EmployerDto employerDto = new EmployerDto();

        modelMapper.map(employer,employerDto);

        return employerDto;
    }
}
