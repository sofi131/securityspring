window.onload = () => {
    document.getElementById("formregister").onsubmit = (e) => {
        //con esta línea dice que no envíe el formulario
        e.preventDefault();
        //igual en valor y en tipo
        if(document.getElementById("pass").value===document.getElementById("repass").value){
            document.getElementById("formregister").submit();
        }else{
            alert("Password must be equals");
        }
    }
}
