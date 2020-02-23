/**
 * 
 */
package com.orange.referentiel.referentielapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.orange.referentiel.referentielapi.model.CodeBanque;
import com.orange.referentiel.referentielapi.repository.CodeBanqueRepository;

/**
 * @author steph
 *
 */
@Component
public class CodeBanqueService {
	@Autowired
	private CodeBanqueRepository codeBanqueRepository;
	
	
	public CodeBanque findCodeBanqueById (Integer id) {
		Optional<CodeBanque> codeBanque = codeBanqueRepository.findById(id);
		return codeBanque.get();
	}

}
