package br.com.diaslgg.service;

import br.com.diaslgg.entity.Contract;
import br.com.diaslgg.exceptions.DataAccessException;
import br.com.diaslgg.repository.ContractRespository;

public class ContractService implements IContractService{

    private ContractRespository contractDao;

    public ContractService (ContractRespository contractDao) {
        this.contractDao = contractDao;
    }

    @Override
    public String save(Contract contract, Boolean condition) {
        try {
            return contractDao.save(contract, condition);

        } catch (DataAccessException e) {
            return e.getMessage();
        }
    }

    @Override
    public String search(Long contractId, Boolean condition) {
        try {
            return contractDao.search(contractId, condition);

        } catch (DataAccessException e) {
            return e.getMessage();
        }
    }

    @Override
    public String update(Long contractId, Boolean condition) {
        try {
            return contractDao.update(contractId, condition);

        } catch (DataAccessException e) {
            return e.getMessage();
        }
    }

    @Override
    public String delete(Long contractId, Boolean condition) {
        try {
            return contractDao.delete(contractId, condition);

        } catch (DataAccessException e) {
            return e.getMessage();
        }
    }
}
