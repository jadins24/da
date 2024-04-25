package com.hoa.dto;

public class EmailSendToDTO {

	    private Integer emailsendtoid;
	    private Integer emaildetailid;
	    private String emailto;
	    private Integer clientid;
	    private Boolean activestatus;
	    private ClientDTO client;
	    private EmailDetailDTO emaildetail;

	    // Getters and Setters for all fields

	    public Integer getEmailsendtoid() {
	        return emailsendtoid;
	    }

	    public void setEmailsendtoid(Integer emailsendtoid) {
	        this.emailsendtoid = emailsendtoid;
	    }

	    public Integer getEmaildetailid() {
	        return emaildetailid;
	    }

	    public void setEmaildetailid(Integer emaildetailid) {
	        this.emaildetailid = emaildetailid;
	    }

	    public String getEmailto() {
	        return emailto;
	    }

	    public void setEmailto(String emailto) {
	        this.emailto = emailto;
	    }

	    public Integer getClientid() {
	        return clientid;
	    }

	    public void setClientid(Integer clientid) {
	        this.clientid = clientid;
	    }

	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
	    }

	    public ClientDTO getClient() {
	        return client;
	    }

	    public void setClient(ClientDTO client) {
	        this.client = client;
	    }

	    public EmailDetailDTO getEmaildetail() {
	        return emaildetail;
	    }

	    public void setEmaildetail(EmailDetailDTO emaildetail) {
	        this.emaildetail = emaildetail;
	    }

		@Override
		public String toString() {
			return "EmailsendtoDto [emailsendtoid=" + emailsendtoid + ", emaildetailid=" + emaildetailid + ", emailto="
					+ emailto + ", clientid=" + clientid + ", activestatus=" + activestatus + ", client=" + client
					+ ", emaildetail=" + emaildetail + "]";
		}

		public EmailSendToDTO(Integer emailsendtoid, Integer emaildetailid, String emailto, Integer clientid,
				Boolean activestatus, ClientDTO client, EmailDetailDTO emaildetail) {
			super();
			this.emailsendtoid = emailsendtoid;
			this.emaildetailid = emaildetailid;
			this.emailto = emailto;
			this.clientid = clientid;
			this.activestatus = activestatus;
			this.client = client;
			this.emaildetail = emaildetail;
		}

		public EmailSendToDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
