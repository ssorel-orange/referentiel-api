/**
 * 
 */
package com.orange.referentiel.referentielapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author steph
 *
 */
@Data
@Entity
public class CodeBanque {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String codeBanque;
	
	private String nomBanque;
	

}
