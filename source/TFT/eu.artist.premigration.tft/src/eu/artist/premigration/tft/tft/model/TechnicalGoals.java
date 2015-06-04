/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.model;

import javax.xml.bind.annotation.XmlElement;

import eu.artist.premigration.tft.tft.model.migrationstrategy.TargetPlatform;

/**
 * Java model of xml type Technical Goals
 * @author Burak Karaboga
 *
 */
public class TechnicalGoals {

	
	private ArchitectureAndProgramming a_p;
	private SLA sla;
	private UserControlAndSecurity u_c;
	private IAAS iaas;
	private Interoperability interop;
	private Goals goals;

	@XmlElement
	public ArchitectureAndProgramming getA_p() {
		return a_p;
	}

	public void setA_p(ArchitectureAndProgramming a_p) {
		this.a_p = a_p;
	}

	@XmlElement(name="SLA")
	public SLA getSla() {
		return sla;
	}

	public void setSla(SLA sla) {
		this.sla = sla;
	}

	@XmlElement
	public UserControlAndSecurity getU_c() {
		return u_c;
	}

	public void setU_c(UserControlAndSecurity u_c) {
		this.u_c = u_c;
	}

	@XmlElement
	public IAAS getIaas() {
		return iaas;
	}

	public void setIaas(IAAS iaas) {
		this.iaas = iaas;
	}

	@XmlElement
	public Interoperability getInterop() {
		return interop;
	}

	public void setInterop(Interoperability interop) {
		this.interop = interop;
	}
	
	@XmlElement
	public Goals getGoals() {
		return goals;
	}

	public void setGoals(Goals goals) {
		this.goals = goals;
	}



	public static class ArchitectureAndProgramming {

		private String migratedProgrammingLanguage;
		private boolean migratedProgrammingLanguageChecked;
		private String multitenancy;
		private boolean multitenancyChecked;
		private String databaseScalabilityRequirements;
		private boolean databaseScalabilityRequirementsChecked;

		@XmlElement(name="migratedpl")
		public String getMigratedProgrammingLanguage() {
			return migratedProgrammingLanguage;
		}
		public void setMigratedProgrammingLanguage(String migratedProgrammingLanguage) {
			this.migratedProgrammingLanguage = migratedProgrammingLanguage;
		}
		@XmlElement
		public String getMultitenancy() {
			return multitenancy;
		}
		public void setMultitenancy(String multitenancy) {
			this.multitenancy = multitenancy;
		}
		@XmlElement(name="tdatabasereq")
		public String getDatabaseScalabilityRequirements() {
			return databaseScalabilityRequirements;
		}
		public void setDatabaseScalabilityRequirements(
				String databaseScalabilityRequirements) {
			this.databaseScalabilityRequirements = databaseScalabilityRequirements;
		}
		public boolean isMigratedProgrammingLanguageChecked() {
			return migratedProgrammingLanguageChecked;
		}
		public void setMigratedProgrammingLanguageChecked(
				boolean migratedProgrammingLanguageChecked) {
			this.migratedProgrammingLanguageChecked = migratedProgrammingLanguageChecked;
		}
		public boolean isMultitenancyChecked() {
			return multitenancyChecked;
		}
		public void setMultitenancyChecked(boolean multitenancyChecked) {
			this.multitenancyChecked = multitenancyChecked;
		}
		public boolean isDatabaseScalabilityRequirementsChecked() {
			return databaseScalabilityRequirementsChecked;
		}
		public void setDatabaseScalabilityRequirementsChecked(
				boolean databaseScalabilityRequirementsChecked) {
			this.databaseScalabilityRequirementsChecked = databaseScalabilityRequirementsChecked;
		}
	}

	public static class SLA {
		private Integer reliability;
		private boolean reliabilityChecked;
		private String dataLocation;
		private boolean dataLocationChecked;
		private Float responseSet;
		private boolean responseSetChecked;
		
		@XmlElement
		public Integer getReliability() {
			return reliability;
		}
		public void setReliability(Integer reliability) {
			this.reliability = reliability;
		}
		@XmlElement(name="datalocation")
		public String getDataLocation() {
			return dataLocation;
		}
		public void setDataLocation(String dataLocation) {
			this.dataLocation = dataLocation;
		}
		@XmlElement(name="responset")
		public Float getResponseSet() {
			return responseSet;
		}
		public void setResponseSet(Float responseSet) {
			this.responseSet = responseSet;
		}
		public boolean isReliabilityChecked() {
			return reliabilityChecked;
		}
		public void setReliabilityChecked(boolean reliabilityChecked) {
			this.reliabilityChecked = reliabilityChecked;
		}
		public boolean isDataLocationChecked() {
			return dataLocationChecked;
		}
		public void setDataLocationChecked(boolean dataLocationChecked) {
			this.dataLocationChecked = dataLocationChecked;
		}
		public boolean isResponseSetChecked() {
			return responseSetChecked;
		}
		public void setResponseSetChecked(boolean responseSetChecked) {
			this.responseSetChecked = responseSetChecked;
		}
	}

	public static class UserControlAndSecurity {

		private String configurationRequirements;
		private boolean configurationRequirementsChecked;
		private String authorisationRequirements;
		private boolean authorisationRequirementsChecked;
		
		@XmlElement(name="configreq")
		public String getConfigurationRequirements() {
			return configurationRequirements;
		}
		public void setConfigurationRequirements(String configurationRequirements) {
			this.configurationRequirements = configurationRequirements;
		}
		@XmlElement(name="authorreq")
		public String getAuthorisationRequirements() {
			return authorisationRequirements;
		}
		public void setAuthorisationRequirements(String authorisationRequirements) {
			this.authorisationRequirements = authorisationRequirements;
		}
		public boolean isConfigurationRequirementsChecked() {
			return configurationRequirementsChecked;
		}
		public void setConfigurationRequirementsChecked(
				boolean configurationRequirementsChecked) {
			this.configurationRequirementsChecked = configurationRequirementsChecked;
		}
		public boolean isAuthorisationRequirementsChecked() {
			return authorisationRequirementsChecked;
		}
		public void setAuthorisationRequirementsChecked(
				boolean authorisationRequirementsChecked) {
			this.authorisationRequirementsChecked = authorisationRequirementsChecked;
		}
	}

	public static class IAAS {
		private TargetPlatform targetPlatform;
		private TargetPlatform selectedTargetPlatform;

		@XmlElement(name="targetplat", type=TargetPlatform.class)
		public TargetPlatform getTargetPlatform() {
			return targetPlatform;
		}
		public void setTargetPlatform(TargetPlatform targetPlatform) {
			this.targetPlatform = targetPlatform;
		}
		public TargetPlatform getSelectedTargetPlatform() {
			return selectedTargetPlatform;
		}
		public void setSelectedTargetPlatform(TargetPlatform selectedTargetPlatform) {
			this.selectedTargetPlatform = selectedTargetPlatform;
		}
	}

	public static class Interoperability {
		
		private String InteroperabilityRequirements;
		private boolean InteroperabilityRequirementsChecked;

		@XmlElement(name="interopreq")
		public String getInteroperabilityRequirements() {
			return InteroperabilityRequirements;
		}

		public void setInteroperabilityRequirements(String interoperabilityRequirements) {
			InteroperabilityRequirements = interoperabilityRequirements;
		}

		public boolean isInteroperabilityRequirementsChecked() {
			return InteroperabilityRequirementsChecked;
		}

		public void setInteroperabilityRequirementsChecked(
				boolean interoperabilityRequirementsChecked) {
			InteroperabilityRequirementsChecked = interoperabilityRequirementsChecked;
		}
	}
}
