package com.ca.domain;

import java.sql.Date;

public class CustomerAgreement {
	protected Long cust_agreement_id;
	protected Long cust_prime_id;
	protected String data_provider_cd;
	protected String cust_agreement_desc;
	protected Date efctv_start_ts;
	protected Date efctv_end_ts;
	protected Date sys_create_ts;
	protected String sys_create_user_id;
	protected Date sys_update_ts;
	protected String sys_update_user_id;

	/**
	 * @return the cust_agreement_id
	 */
	public Long getCust_agreement_id() {
		return cust_agreement_id;
	}

	/**
	 * @param cust_agreement_id
	 *            the cust_agreement_id to set
	 */
	public void setCust_agreement_id(Long cust_agreement_id) {
		this.cust_agreement_id = cust_agreement_id;
	}

	/**
	 * @return the cust_prime_id
	 */
	public Long getCust_prime_id() {
		return cust_prime_id;
	}

	/**
	 * @param cust_prime_id
	 *            the cust_prime_id to set
	 */
	public void setCust_prime_id(Long cust_prime_id) {
		this.cust_prime_id = cust_prime_id;
	}

	/**
	 * @return the data_provider_cd
	 */
	public String getData_provider_cd() {
		return data_provider_cd;
	}

	/**
	 * @param data_provider_cd
	 *            the data_provider_cd to set
	 */
	public void setData_provider_cd(String data_provider_cd) {
		this.data_provider_cd = data_provider_cd;
	}

	/**
	 * @return the cust_agreement_desc
	 */
	public String getCust_agreement_desc() {
		return cust_agreement_desc;
	}

	/**
	 * @param cust_agreement_desc
	 *            the cust_agreement_desc to set
	 */
	public void setCust_agreement_desc(String cust_agreement_desc) {
		this.cust_agreement_desc = cust_agreement_desc;
	}

	/**
	 * @return the efctv_start_ts
	 */
	public Date getEfctv_start_ts() {
		return efctv_start_ts;
	}

	/**
	 * @param efctv_start_ts
	 *            the efctv_start_ts to set
	 */
	public void setEfctv_start_ts(Date efctv_start_ts) {
		this.efctv_start_ts = efctv_start_ts;
	}

	/**
	 * @return the efctv_end_ts
	 */
	public Date getEfctv_end_ts() {
		return efctv_end_ts;
	}

	/**
	 * @param efctv_end_ts
	 *            the efctv_end_ts to set
	 */
	public void setEfctv_end_ts(Date efctv_end_ts) {
		this.efctv_end_ts = efctv_end_ts;
	}

	/**
	 * @return the sys_create_ts
	 */
	public Date getSys_create_ts() {
		return sys_create_ts;
	}

	/**
	 * @param sys_create_ts
	 *            the sys_create_ts to set
	 */
	public void setSys_create_ts(Date sys_create_ts) {
		this.sys_create_ts = sys_create_ts;
	}

	/**
	 * @return the sys_create_user_id
	 */
	public String getSys_create_user_id() {
		return sys_create_user_id;
	}

	/**
	 * @param sys_create_user_id
	 *            the sys_create_user_id to set
	 */
	public void setSys_create_user_id(String sys_create_user_id) {
		this.sys_create_user_id = sys_create_user_id;
	}

	/**
	 * @return the sys_update_ts
	 */
	public Date getSys_update_ts() {
		return sys_update_ts;
	}

	/**
	 * @param sys_update_ts
	 *            the sys_update_ts to set
	 */
	public void setSys_update_ts(Date sys_update_ts) {
		this.sys_update_ts = sys_update_ts;
	}

	/**
	 * @return the sys_update_user_id
	 */
	public String getSys_update_user_id() {
		return sys_update_user_id;
	}

	/**
	 * @param sys_update_user_id
	 *            the sys_update_user_id to set
	 */
	public void setSys_update_user_id(String sys_update_user_id) {
		this.sys_update_user_id = sys_update_user_id;
	}

}