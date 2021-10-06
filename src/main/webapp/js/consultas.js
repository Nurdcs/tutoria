$(document).ready(function(){

	

  /*$.ajax({
  url: "Consultar",
  type:"post",
  success: function( result ) {
    $( "#cont" ).html(  result  );
  }
});*/


$('.txt').on('keyup',function(){
	
	let x=$('.txt').val();
$.ajax({
  url: "Consultar",
  type:"post",
  data:{yy:x},
  success: function( result ) {
    $( "#cont2" ).html(  result  );
  }
});
	
});


$.ajax({
  url: "Consultar",
  type:"post",
  dataType:'json',
  success: function( result ) {
   //console.log(result);
   let clientes=document.querySelector('#tabla');
   clientes.innerHTML='';
   clientes.innerHTML=`<tr><td>documento</td>
                            <td>Nombre</td>
                            <td>Apellido</td>
                            <td>documento</td>
                            <td>documento</td>
                            <td>documento</td>
                            <td>documento</td>    
                            <td>documento</td>
                            </tr>`;



for(let i of result){
	
	 clientes.innerHTML+=`<tr><td>${i.doccli}</td>
                            <td>${i.nomcli}</td>
                            <td>${i.apecli}</td>
                            <td>${i.celulra}</td>
                            <td>${i.doccli}</td>
                            <td>${i.doccli}</td>
                            <td>${i.doccli}</td>    
                            <td>${i.doccli}</td>
                            </tr>`;
	
}

  }
});





	
});		
	
	
