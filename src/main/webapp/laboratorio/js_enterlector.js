/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function teclas(event) {
    tecla=(document) ? event.keyCode : event.which;
    if (tecla===13) {
        
       
         document.getElementById("frm_regPres:txt_usu").focus();
 }

    else {return event;}
 
    return false;
}

function entertoclick(event){
    tecla = (document) ? event.keyCode : event.which;
    if(tecla ===13){
       
        document.getElementById("frm_ficha:btn_consulta").click();
        
    }
}

