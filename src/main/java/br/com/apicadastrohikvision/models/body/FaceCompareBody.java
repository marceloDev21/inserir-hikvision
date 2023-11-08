package br.com.apicadastrohikvision.models.body;



public class FaceCompareBody {

	private Long serialNumber;
	private Probe probe;
	private Candidate candidate;

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Probe getProbe() {
		return probe;
	}

	public void setProbe(Probe probe) {
		this.probe = probe;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

}