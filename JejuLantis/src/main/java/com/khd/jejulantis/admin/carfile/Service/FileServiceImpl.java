package com.khd.jejulantis.admin.carfile.Service;

import java.io.File;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.khd.jejulantis.admin.carfile.Controller.Path;
import com.khd.jejulantis.model.FileDTO;

@Service("fileService")
public class FileServiceImpl implements FileService{
	public boolean fileUpload(FileDTO dto) {
		File fStore = new File(Path.FILE_STORE);
		if(!fStore.exists()) fStore.mkdirs();
		
		MultipartFile mFile = dto.getUploadfile();
		String originalFileName = mFile.getOriginalFilename();
		String saveFileName = originalFileName;
		
		if(saveFileName != null) {
			saveFileName = saveFileName.trim();
			if(saveFileName.length() !=0) {
				if(new File(Path.FILE_STORE, saveFileName).exists()) {
					int idx = saveFileName.lastIndexOf(".");
					String fileName = saveFileName.substring(0, idx);
					String fileExt = saveFileName.substring(idx+1);
					
					saveFileName = fileName + "_"+System.currentTimeMillis()+"."+fileExt;
				}
				try {
					mFile.transferTo(new File(Path.FILE_STORE,saveFileName));
					return true;
				}catch(Exception e) {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
