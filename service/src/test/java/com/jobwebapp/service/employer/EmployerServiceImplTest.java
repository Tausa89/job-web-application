package com.jobwebapp.service.employer;


import com.jobwebapp.dto.AddressDto;
import com.jobwebapp.dto.EmployerDto;
import com.jobwebapp.enums.AccountRole;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class EmployerServiceImplTest {


    @Test
    public void findAll() {

        //given
        List<EmployerDto> employerDto = prepareEmployerData();
        EmployerServiceImpl employerServiceImpl = mock(EmployerServiceImpl.class);
        when(employerServiceImpl.findAll()).thenReturn(employerDto);

        //when
        List<EmployerDto> accountList = employerServiceImpl.findAll();

        //then
        assertNotNull(accountList);




    }

    private List<EmployerDto> prepareEmployerData(){

        return Arrays.asList(
                EmployerDto.
                        builder()
                        .accountRole(AccountRole.EMPLOYER)
                        .companyName("NameOne")
                        .companyAddress(new AddressDto())
                        .id(1)
                        .build(),
                EmployerDto
                        .builder()
                        .accountRole(AccountRole.EMPLOYER)
                        .companyName("NameThree")
                        .companyAddress(new AddressDto())
                        .id(2)
                        .build(),
                EmployerDto
                        .builder()
                        .accountRole(AccountRole.EMPLOYER)
                        .companyName("NameTwo")
                        .companyAddress(new AddressDto())
                        .id(3)
                        .build());

    }
}