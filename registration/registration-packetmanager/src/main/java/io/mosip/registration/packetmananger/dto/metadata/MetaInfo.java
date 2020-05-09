package io.mosip.registration.packetmananger.dto.metadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import io.mosip.registration.packetmananger.dto.SimpleDto;
import lombok.Data;

@Data
public class MetaInfo {	
	
	public MetaInfo() {
		this.metaData = new ArrayList<FieldValue>();
		this.operationsData = new ArrayList<FieldValue>();
		this.biometrics = new HashMap<>();
		this.exceptionBiometrics = new ArrayList<ModalityException>();
		this.documents = new ArrayList<DocumentMetaInfo>();		
		this.hashSequence1 = new LinkedList<HashSequenceMetaInfo>();
		this.hashSequence2 = new LinkedList<HashSequenceMetaInfo>();	
		this.operationsData = new ArrayList<FieldValue>();
	}
	
	private Map<String, Map<String, ModalityInfo>> biometrics;
	private List<ModalityException> exceptionBiometrics;
	private List<DocumentMetaInfo> documents;
	private List<FieldValue> metaData;
	private List<FieldValue> operationsData;
	private List<HashSequenceMetaInfo> hashSequence1;
	private List<HashSequenceMetaInfo> hashSequence2;
	private List<DeviceMetaInfo> capturedRegisteredDevices;
	private List<FieldValue> capturedNonRegisteredDevices;
	private List<FieldValue> checkSum;
	private List<SimpleDto> printingName;
	
	public void setBiometrics(String subType, String modalityName, ModalityInfo modalityInfo) {
		if(this.biometrics.containsKey(subType) && this.biometrics.get(subType) != null) {
			this.biometrics.get(subType).put(modalityName, modalityInfo);
		}
		else {
			Map<String, ModalityInfo> map = new HashMap<>();
			map.put(modalityName, modalityInfo);
			this.biometrics.put(subType, map);
		}
	}
	
	public void setBiometricException(List<ModalityException> modalityExceptions) {
		this.exceptionBiometrics.addAll(modalityExceptions);
	}
	
	public void addDocumentMetaInfo(DocumentMetaInfo documentMetaInfo) {
		this.documents.add(documentMetaInfo);
	}
	
	public void addMetaData(FieldValue fieldValue) {
		if(!this.metaData.contains(fieldValue))
			this.metaData.add(fieldValue);	
	}
	
	public void addOperationsData(FieldValue fieldValue) {
		if(!this.operationsData.contains(fieldValue))
			this.operationsData.add(fieldValue);	
	}
	
	public void addHashSequence1(HashSequenceMetaInfo hashSequenceMetaInfo) {
		this.hashSequence1.add(hashSequenceMetaInfo);
	}
	
	public void addHashSequence2(HashSequenceMetaInfo hashSequenceMetaInfo) {
		this.hashSequence2.add(hashSequenceMetaInfo);
	}
}