/**
 * 
 */
function initPage() {
  switch (window.location.pathname) {
    case "/projetFilRougeWeb/accueil":
      showSlides(0);
      break;

    case "/projetFilRougeWeb/catalogue":
      majTheme();
      //getIdModulesMatchThemeSelected();
      break;



    default:
      break;

  }
}



function majTheme() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      let themes = JSON.parse(this.responseText);
      let themesHTML = "<option value=''></option>";
      //themes.forEach(element => themesHTML += "<option value='" + element.idTheme + "'>" + element.nom + "</option>");
      for(i=0; i<themes.length; i++)
      {
        themesHTML += "<option value='" + themes[i].idTheme + "' >" + themes[i].nom + "</option>";
      }
      let select = document.querySelector("#theme");
      select.innerHTML = themesHTML;

    }
  };
  xhttp.open("GET", "/projetFilRougeRS/serviceRS/theme/themes", true);
  //appel au serveur
  xhttp.send();

  //majModule();
  
}

function majModule() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      let modules = JSON.parse(this.responseText);
      //let modulesHTML = "";
      //modules.forEach(element => modulesHTML += "<option value='" + element.id + "'>" + element.nom + "</option>");
      let idModuleHTML = "";
      modules.module.forEach(element => idModuleHTML += "<option value='" + element.id + "'>" + element.nom + "</option>");
      
      let select = document.querySelector("#module");
      select.innerHTML = idModuleHTML;
      //loadModuleDescription();
    }
  };

  var e = document.getElementById("theme");
  var strUser = e.value;
  xhttp.open("GET", "/projetFilRougeRS/serviceRS/theme/" + strUser, true);
  //appel au serveur
  xhttp.send();

  loadModuleDescription();

}

function loadModuleDescription() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      let modules = JSON.parse(this.responseText);
      let select = document.querySelector("#objectif");
      select.innerHTML = modules.objectif;
      select = document.querySelector("#preRequis");
      select.innerHTML = modules.prerequis;
      select = document.querySelector("#programme");
      select.innerHTML = modules.programme;
      select = document.querySelector("#prix");
      select.innerHTML = modules.prixHT + " &euro;";
    }
  };

  var e = document.getElementById("module");


  xhttp.open("GET", "/projetFilRougeRS/serviceRS/module/" + e.value, true);
  //appel au serveur
  xhttp.send();
}

function majVille() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      let sessions = JSON.parse(this.responseText);
      let sessionHTML = "";
      let moduleSelect = document.getElementById("module");
      let options = { year: "numeric", month: "long", day: "2-digit" };
      for(i=0; i<sessions.length; i++)
      {
        if(sessions[i].module.id == moduleSelect.value){
          sessionHTML += "<option value='" + sessions[i].id + "' >" + sessions[i].salle.ville + " du " + (new Date(sessions[i].dateDeb)).toLocaleDateString("fr-FR", options) + " au " + (new Date(sessions[i].dateFin)).toLocaleDateString("fr-FR", options) + "</option>";
        }
      }

      //sessions.forEach(element => idModuleHTML += element);
      
      
      let select = document.querySelector("#session");
      select.innerHTML = sessionHTML;
    }
  };

  xhttp.open("GET", "/projetFilRougeRS/serviceRS/session/sessions", true);
  //appel au serveur
  xhttp.send();
}

/*var slideIndex = 1;
showSlides(slideIndex);*/

// Next/previous controls
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Thumbnail image controls
function currentSlide(n) {
  showSlides(slideIndex = n);
}

/*function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";
  dots[slideIndex-1].className += " active";
}*/

var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  slideIndex++;
  if (slideIndex > slides.length) { slideIndex = 1 }
  slides[slideIndex - 1].style.display = "block";
  setTimeout(showSlides, 5000); // Change image every 2 seconds
}



