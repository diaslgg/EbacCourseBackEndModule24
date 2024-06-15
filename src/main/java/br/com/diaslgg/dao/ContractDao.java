package br.com.diaslgg.dao;

import br.com.diaslgg.entity.Contract;
import br.com.diaslgg.exceptions.DataAccessException;
import br.com.diaslgg.repository.ContractRespository;

public class ContractDao implements ContractRespository {
    @Override
    public String save(Contract contract, Boolean condition) throws DataAccessException{
        if(!condition){
            throw new DataAccessException();
        }
        return "Contract saved.";
    }

    @Override
    public String search(Long contractId, Boolean condition) throws DataAccessException {
        if(!condition) {
            throw new DataAccessException();
        }

        return "Contract found.";
    }

    @Override
    public String update(Long contractId, Boolean condition) throws DataAccessException{
        if(!condition) {
            throw new DataAccessException();
        }

        return "Contract updated.";
    }

    @Override
    public String delete(Long contractId, Boolean condition) throws DataAccessException{
        if(!condition) {
            throw new DataAccessException();
        }

        return "Contract deleted.";
    }
}
