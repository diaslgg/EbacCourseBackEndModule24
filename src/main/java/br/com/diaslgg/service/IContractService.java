package br.com.diaslgg.service;

import br.com.diaslgg.entity.Contract;

public interface IContractService {
    String save(Contract contract, Boolean condition);

    String search(Long contractId, Boolean condition);

    String update(Long contractId, Boolean condition);

    String delete(Long contractId, Boolean condition);
}
