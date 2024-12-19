	function emailChk(){
		if(document.frm.userEmail3.value != "text"){
			document.frm.userEmail2.value = document.frm.userEmail3.value;
			return false;
		}
		else{
			document.frm.userEmail2.value = "";
			document.frm.userEmail2.focus();
			return false;
		}
	}