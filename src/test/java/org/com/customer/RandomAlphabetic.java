/*
 *--------------------------------------------------------
 * Administrateur
 *--------------------------------------------------------
 * Project     : quarkus-mysql
 *
 * Copyright Administrateur,  All Rights Reserved.
 *
 *-------------------------------------------------------- 
 * 
 * Fichier 		:	RandomAlphabetic.java
 * Créé le 		: 	12 juin 2023 à 16:06:56
 * Auteur		: 	admin
 * 
 * Description 	:
 * 
 *---------------------------------------------------------
 */
package org.com.customer;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * A Renseigner.
 * @author  : admin
 * @project : quarkus-mysql
 * @package : org.com.customer
 * @date    : 12 juin 2023 16:06:56
 */
public class RandomAlphabetic
{
   public static void main( String[] args )
   {
      for(int i = 0 ; i < 20 ; i++)
      System.out.println( RandomStringUtils.randomAlphabetic(20).toUpperCase() );
   }
}
