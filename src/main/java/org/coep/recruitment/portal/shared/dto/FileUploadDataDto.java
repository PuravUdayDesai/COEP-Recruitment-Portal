package org.coep.recruitment.portal.shared.dto;

import java.io.Serializable;

public class FileUploadDataDto implements Serializable
{

	private static final long serialVersionUID = -8745695085055214995L;
	private String            filePath;
	private Long              fileSize;
	private String            fileType;

	public FileUploadDataDto()
	{

	}

	public FileUploadDataDto(String filePath, Long fileSize, String fileType)
	{
		super();
		this.filePath = filePath;
		this.fileSize = fileSize;
		this.fileType = fileType;
	}

	public String getFilePath()
	{
		return filePath;
	}

	public void setFilePath(String filePath)
	{
		this.filePath = filePath;
	}

	public Long getFileSize()
	{
		return fileSize;
	}

	public void setFileSize(Long fileSize)
	{
		this.fileSize = fileSize;
	}

	public String getFileType()
	{
		return fileType;
	}

	public void setFileType(String fileType)
	{
		this.fileType = fileType;
	}

}