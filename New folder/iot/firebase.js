var firebaseConfig = {
    apiKey: "AIzaSyBB-8sHfWyO37r44furIWlCKLhZE4x17k4",
    authDomain: "iots-91495.firebaseapp.com",
    projectId: "iots-91495",
    storageBucket: "iots-91495.appspot.com",
    messagingSenderId: "865242421780",
    appId: "1:865242421780:web:107c309964e37407f3a501"
  };
  // Initialize Firebase
  firebase.initializeApp(firebaseConfig);

var gar_den = document.getElementById("den");
var gar_bom_on = document.getElementById("btn_on");
var gar_bom_off = document.getElementById("btn_off");
var gar_muc_nuoc = document.getElementById("mucnuoc");

var ma_the = document.getElementById("passcode");
var submit = document.getElementById("btnSubmit");


//GARDEN
gar_den.addEventListener("mousemove", function(){
  var gar_den_val = gar_den.value;
  firebase.database().ref("GARDEN/").update({
    DEN: gar_den_val
  })
})

gar_bom_on.onclick = function(){
  firebase.database().ref("GARDEN/").update({
    BOM: "ON"
  })
}

gar_bom_off.onclick = function(){
  firebase.database().ref("GARDEN/").update({
    BOM: "OFF"
  })
}

var bom_nuoc_f = firebase.database().ref("GARDEN/BOM/");
bom_nuoc_f.on("value",function(snapshot){
  bom_nuoc_val = snapshot.val();
  if(bom_nuoc_val == "ON"){
    document.getElementById("bom_nuoc").src = "assets/img/may_bom_mo.png"
  }
  else if(bom_nuoc_val == "OFF"){
    document.getElementById("bom_nuoc").src = "assets/img/may_bom.png"
  }
})

gar_muc_nuoc.addEventListener("mousemove", function(){
  var gar_muc_nuoc_val = gar_muc_nuoc.value;
  firebase.database().ref("GARDEN/").update({
    MUC_NUOC: gar_muc_nuoc_val
  })
})


var gar_nhiet_do = firebase.database().ref("GARDEN/NHIET_DO");
gar_nhiet_do.on("value",function(snapshot){
  update_nhiet_do(snapshot.val());
})

var gar_do_am = firebase.database().ref("GARDEN/DO_AM");
gar_do_am.on("value",function(snapshot){
  update_do_am(snapshot.val());
  
})

var gar_anh_sang = firebase.database().ref("GARDEN/ANH_SANG");
gar_anh_sang.on("value",function(snapshot){
  update_anh_sang(snapshot.val());
})


//DOOR
  //DEN CUA
var doorLight = firebase.database().ref("DOOR/DEN/");
doorLight.on("value",function(snapshot){
  var doorLightValue = snapshot.val();
  if(doorLightValue == "ON"){
    document.getElementById("doorLight").src = "assets/img/light_bulb.png"
  }
  else if(doorLightValue == "OFF"){
    document.getElementById("doorLight").src = "assets/img/light_bulb_off.png"
  }
})
  //CUA
var doorState = firebase.database().ref("DOOR/CUA/");
doorState.on("value",function(snapshot){
  var doorStateVal = snapshot.val();
  if(doorStateVal == "OPEN"){
    document.getElementById("door_state").src = "assets/img/door_open.png"
  }
  else if(doorStateVal == "CLOSE"){
    document.getElementById("door_state").src = "assets/img/door_close.png"
  }
})
  //BAO DONG
var door_bao_dong = document.getElementById("off");
door_bao_dong.onclick = function(){
  firebase.database().ref("DOOR/").update({
    BAO_DONG: "OFF"
  })
}
var bao_dong = firebase.database().ref("DOOR/BAO_DONG/");
bao_dong.on("value",function(snapshot){
  var bao_dong_state = snapshot.val();
  if (bao_dong_state == "ON"){
    document.getElementById("bulb_change").src = "assets/img/bao_dong.png";
    alert("Có người xâm nhập trái phép!");
  }
  else if (bao_dong_state == "OFF"){
    document.getElementById("bulb_change").src = "assets/img/bao_dong_off.png"
  }
})

//SETTING
function sendCode(){

}






function update_nhiet_do(nhiet_do){
  $("#slider1").roundSlider({
    sliderType: "min-range",
    width: 22,
    radius: 100,
    readOnly: true,
    value: nhiet_do,
    circleShape: "half-top",
    lineCap: "round",
    editableTooltip: false,
    max: 100,
    svgMode: true,
    rangeColor: "red"
  });
}

function update_do_am(do_am){
  $("#slider2").roundSlider({
    
    sliderType: "min-range",
    readOnly: true,
    width: 22,
    radius: 100 ,
    value: do_am,
    circleShape: "half-top",
    lineCap: "round",
    editableTooltip: false,
    max: 100,

    svgMode: true,
    rangeColor: "blue"
    });
}

function update_anh_sang(anh_sang){
  $("#slider3").roundSlider({
    sliderType: "min-range",
    width: 22,
    radius: 100,
    readOnly: true,
    value: anh_sang,
    circleShape: "half-top",
    lineCap: "round",
    editableTooltip: false,
    max: 1000,
    svgMode: true,
    rangeColor: "yellow"
  });
}


