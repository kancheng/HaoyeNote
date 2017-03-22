function sideLength(){
	var a = parseInt(document.getElementById("tra").value);
	var b = parseInt(document.getElementById("trb").value);
	var c = parseInt(document.getElementById("trc").value);
	var s = 0 ;
	var triar_tem = 0 ;
	if( a && b && c ){

		if( (a + b) > c && ( a + c ) > b && ( b + c ) > a ) {
			sola.innerHTML="三角形成立";
			s = ( a + b + c ) / 2;
			triar_tem = Math.sqrt((s * ( s - a ) * ( s - b ) * ( s - c )));
			triarea.innerHTML="三角形面積 : " + triar_tem;

		} else{
			sola.innerHTML="三角形不成立";
			return;
		}					
	} else {
		sola.innerHTML="<p >輸入不可為空白</p>";
	}

}

function oao(){
	tra = 0;
	trb = 0;
	trc = 0;
	document.getElementById("tra").value = '0';
	document.getElementById("trb").value = '0';
	document.getElementById("trc").value = '0';
	document.getElementById("sola").innerHTML="OwO ////";
	document.getElementById("triarea").innerHTML=" ";
}