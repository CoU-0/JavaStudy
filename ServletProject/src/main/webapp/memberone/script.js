function idCheck(id) {
   if(id == ""){
      alert("아이디를 입력해 주세요")
      document.regForm.id.focus();
   } else {
      url = "idCheck.jsp?id="+id;
      window.open(url,"post","width=300,height=150");
   }

}

function zipCheck(){ // 입력을 받는다 
	url ="zipCheck.jsp?check=y";
	window.open(url, "post", "toolbar=no, width =500 , height = 300 directories =no, status = yes, scrollbars=yes, menubar=no") // 윈도우 창을 연다 	
}
//이벤트 구
function dongCheck(){ // 입력을 받는다 . - 동이름 매개변수로 받음 
	if(document.zipForm.dong.value ==" "){
		alert("동 이름을 입력하세요")
		document.zipForm.dong.focus();
		return;
	}
	document.zipForm.submit();
}

function sendAddress(zipcode,sido,gugun,dong,ri,bunji){
	
	var address = sido +" "+gugun+" "+dong +" "+ri+" "+bunji;
	opener.document.regForm.zipcode.value=zipcode;
	opener.document.regForm.address1.value=address;
	self.close();
}


function inputCheck(){
	if(document.regForm.id.value==""){
		alert("아이디를 입력해주세요");
		document.regForm.id.focus();
		return;
	}      
		   if(document.regForm.pass.value==""){
		alert("비밀번호를 입력해주세요");
		document.regForm.pass.focus();
		return;
	}      
	if(document.regForm.repass.value !=document.regForm.pass.value){
		alert("비밀번호가 일치하지 않습니다. 입력해주세요");
		document.regForm.repass.focus();
		return;

	}
	if(document.regForm.name.value==""){
		alert("이름을 입력해주세요");
		document.regForm.name.focus();
		return;
	}        
	
	if(document.regForm.phone1.value==""){
		alert("국번을 입력해주세요");
		document.regForm.phone1.focus();
		return;
	}      
	if(document.regForm.phone2.value==""){
		alert("전화번호를 입력해주세요");
		document.regForm.phone2.focus();
		return;
	}      
	if(document.regForm.phone3.value==""){
		alert("전화번호를 입력해주세요");
		document.regForm.phone3.focus();
		return;
	}      
	if(document.regForm.email.value==""){
		alert("email을 입력해주세요");
		document.regForm.email.focus();
		return;
	}      
	// 이메일 형식검사 hong@naver.com (이메일 형식검사)
	var str = document.regForm.email.value; 
	var atPos = str.indexOf('@'); // 에이트 앞쪽 
	var atLastPos = str.lastIndexOf('@') // 에이트 뒤쪽 
	var dotPos = str.indexOf('.');
	var spacePos = str.indexOf(' ');
	var commaPos = str.indexOf(',')
	var eMailSize = str.length;
	
	if(atPos > 1 && atPos==atLastPos && dotPos >3 && spacePos == -1 && commaPos ==-1 && atPos+1<dotPos && dotPos +1< eMailSize);
	else {
		alert ("E_mail 주소형식이 잘못되었습니다. \n\r 다시 입력해주세요");
		document.regForm.eamil.focus();
		return;
		
	}
	
	if(document.regForm.zipcode.value==""){
		alert("우편번호를 입력해주세요");
		document.regForm.zipcode.focus();
		return;
	}      
	
	if(document.regForm.address1.value==""){
		alert("주소를 입력해주세요");
		document.regForm.address1.focus();
		return;
	}      
	
	if(document.regForm.address2.value==""){
		alert("상세주소를 입력해주세요");
		document.regForm.address2.focus();
		return;
	}      
	
	document.regForm.submit(); // 이거 없으면 넘어갈 수 없음 

	}

function updateCheck(){
	
		if(document.regForm.pass.value==""){
		alert("비밀번호를 입력해주세요");
		document.regForm.pass.focus();
		return;
	}      
	if(document.regForm.repass.value !=document.regForm.pass.value){
		alert("비밀번호가 일치하지 않습니다. 입력해주세요");
		document.regForm.repass.focus();
		return;

	}
	
	if(document.regForm.phone1.value==""){
		alert("국번을 입력해주세요");
		document.regForm.phone1.focus();
		return;
	}      
	if(document.regForm.phone2.value==""){
		alert("전화번호를 입력해주세요");
		document.regForm.phone2.focus();
		return;
	}      
	if(document.regForm.phone3.value==""){
		alert("전화번호를 입력해주세요");
		document.regForm.phone3.focus();
		return;
	}      
	if(document.regForm.email.value==""){
		alert("email을 입력해주세요");
		document.regForm.email.focus();
		return;
	}      
	// 이메일 형식검사 hong@naver.com (이메일 형식검사)
	var str = document.regForm.email.value; 
	var atPos = str.indexOf('@'); // 에이트 앞쪽 
	var atLastPos = str.lastIndexOf('@') // 에이트 뒤쪽 
	var dotPos = str.indexOf('.');
	var spacePos = str.indexOf(' ');
	var commaPos = str.indexOf(',')
	var eMailSize = str.length;
	
	if(atPos > 1 && atPos==atLastPos && dotPos >3 && spacePos == -1 && commaPos ==-1 && atPos+1<dotPos && dotPos +1< eMailSize);
	else {
		alert ("E_mail 주소형식이 잘못되었습니다. \n\r 다시 입력해주세요");
		document.regForm.eamil.focus();
		return;
		
	}
	
	if(document.regForm.zipcode.value==""){
		alert("우편번호를 입력해주세요");
		document.regForm.zipcode.focus();
		return;
	}      
	
	if(document.regForm.address1.value==""){
		alert("주소를 입력해주세요");
		document.regForm.address1.focus();
		return;
	}      
	if(document.regForm.address2.value==""){
		alert("상세주소를 입력해주세요");
		document.regForm.address2.focus();
		return;
	}      
	
	
	
	document.regForm.submit(); // 이거 없으면 넘어갈 수 없음 

	
	
}
function begin(){
	document.myForm.pass.focus();
	
}

function checkIt( ){
	if(!document.myForm.pass.value){
		alert("비밀번호가 입력되지 않았습니다.");
	document.myForm.pass.focus();
	return false;
	}
}


