/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function teclas(event) {
    tecla=(document) ? event.keyCode : event.which;
    if (tecla===13) {
        alert('Presiono Enter');
        
    }
    else {return event;}
 
    return false;
}

