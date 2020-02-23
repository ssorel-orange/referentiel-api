/**
 * 
 */
package com.orange.referentiel.referentielapi.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.referentiel.referentielapi.model.CodeBanque;
import com.orange.referentiel.referentielapi.service.CodeBanqueService;

/**
 * @author steph
 *
 */
@RestController
@RequestMapping("/api/referentiel/v1")
public class ReferentialApiController {
	@Autowired
	private CodeBanqueService codeBanqueService;
	
	@GetMapping(path = "/codebanque/{id}")
	public CodeBanque findCodeBanqueById( @PathVariable Integer id) {
		return codeBanqueService.findCodeBanqueById(id);
	}
	
	
}
