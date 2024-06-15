package br.com.diaslgg.service;

import br.com.diaslgg.entity.Contract;
import br.com.diaslgg.dao.ContractDao;
import br.com.diaslgg.exceptions.DataAccessException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ContractServiceTest {

    @Mock
    private ContractDao contractDao;

    @Mock
    private Contract contract;

    private IContractService contractService;

    @BeforeEach
    void setUp() {
        contractService = new ContractService(contractDao);
    }

    @Test
    void saveSuccessTest() {
        when(contractDao.save(contract, true)).thenReturn("Contract saved.");

        String saveTest = this.contractService.save(contract, true);

        assertEquals("Contract saved.", saveTest);

    }

    @Test
    void saveFailedDataAccessExceptionTest() {
        doThrow(new DataAccessException()).when(contractDao).save(contract, false);

        String saveFailed = this.contractService.save(contract, false);

        assertEquals("Cannot finish the operation. Database inaccessible.", saveFailed);
    }

    @Test
    void searchSuccessTest() {
        when(contractDao.search(1L, true)).thenReturn("Contract found.");

        String searchTest = this.contractService.search(1L, true);

        assertEquals("Contract found.", searchTest);
    }

    @Test
    void searchFailedDataAccessExceptionTest() {
        doThrow(new DataAccessException()).when(contractDao).search(1L ,false);

        String searchFailed = this.contractService.search(1L, false);

        assertEquals("Cannot finish the operation. Database inaccessible.", searchFailed);
    }

    @Test
    void updateSuccessTest() {
        when(contractDao.update(1L, true)).thenReturn("Contract updated.");

        String updateTest = this.contractService.update(1L, true);

        assertEquals("Contract updated.", updateTest);
    }

    @Test
    void updateFailedDataAccessExceptionTest() {
        doThrow(new DataAccessException()).when(contractDao).update(1L, false);

        String updateTest = this.contractService.update(1L, false);

        assertEquals("Cannot finish the operation. Database inaccessible.", updateTest);
    }

    @Test
    void deleteSuccessTest() {
        when(contractDao.delete(1L, true)).thenReturn("Contract deleted.");

        String deleteTest = this.contractService.delete(1L, true);

        assertEquals("Contract deleted.", deleteTest);
    }

    @Test
    void deleteFailedDataAccessExceptionTest() {
        doThrow(new DataAccessException()).when(contractDao).delete(1L, false);

        String deleteTest = this.contractService.delete(1L, false);

        assertEquals("Cannot finish the operation. Database inaccessible.", deleteTest);
    }

}
