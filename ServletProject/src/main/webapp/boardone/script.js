function writeSave(){
	if(document.writeForm.writer.value==""){
		alert("작성자룰 입력해주세요");
		document.writeForm.writer.focus();
		return false;
	}
	
	if(document.writeForm.email.value==""){
		alert("이메일을 입력해주세요");
		document.writeForm.email.focus();
		return  false;
	}
	
	if(document.writeForm.subject.value==""){
		alert("제목을 입력해주세요");
		document.writeForm.subject.focus();
		return false;
	}
	
	if(document.writeForm.content.value==""){
		alert("내용을 입력해주세요");
		document.writeForm.content.focus();
		return false;
	}
	
	if(document.writeForm.pass.value==""){
		alert("비밀번호를 입력해주세요");
		document.writerForm.pass.focus();
		return false;
	}
}

function deleteSave(){
	//비밀번호 처리 안됐으니 if 로 처리 
	if(document.delForm.pass.value==null){
		alert("비밀번호를 입력해주세요");
		document.delForm.pass.focus();
		return false;

	}

	
	
}

