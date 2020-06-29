package com.ca.dto;

import java.util.Date;

public class CustomerAgreementDto {
	private Long agreementId;
	private Long primeId;
	private String providerCode;
	private String description;
	private Date EfctvStartTs;
	private Date EfctvEndTs;

	/**
	 * @return the agreementId
	 */
	public Long getAgreementId() {
		return agreementId;
	}

	/**
	 * @param agreementId
	 *            the agreementId to set
	 */
	public void setAgreementId(Long agreementId) {
		this.agreementId = agreementId;
	}

	/**
	 * @return the primeId
	 */
	public Long getPrimeId() {
		return primeId;
	}

	/**
	 * @param primeId
	 *            the primeId to set
	 */
	public void setPrimeId(Long primeId) {
		this.primeId = primeId;
	}

	/**
	 * @return the providerCode
	 */
	public String getProviderCode() {
		return providerCode;
	}

	/**
	 * @param providerCode
	 *            the providerCode to set
	 */
	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the efctvStartTs
	 */
	public Date getEfctvStartTs() {
		return EfctvStartTs;
	}

	/**
	 * @param efctvStartTs
	 *            the efctvStartTs to set
	 */
	public void setEfctvStartTs(Date efctvStartTs) {
		EfctvStartTs = efctvStartTs;
	}

	/**
	 * @return the efctvEndTs
	 */
	public Date getEfctvEndTs() {
		return EfctvEndTs;
	}

	/**
	 * @param efctvEndTs
	 *            the efctvEndTs to set
	 */
	public void setEfctvEndTs(Date efctvEndTs) {
		EfctvEndTs = efctvEndTs;
	}

}
