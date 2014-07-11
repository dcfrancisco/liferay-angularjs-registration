
/*
var progress=0;
$(function() {
  $("#section2, #section3, #section4, #completed").hide();
    $(".back").click(function( event ) {
    console.log(event.currentTarget.parentNode.parentNode.id);
    sectionNum=event.currentTarget.parentNode.parentNode.id.substr(7,event.currentTarget.parentNode.parentNode.id.length)*1;
    console.log(sectionNum);
    $("#section"+sectionNum).hide();
    if(sectionNum!=1){
        console.log("#section"+(sectionNum--));
        $("#section"+(sectionNum--)).show();
    }
    event.preventDefault();
  });
  $("form").submit(function( event ) {
    sectionNum=event.currentTarget.parentNode.id.substr(7,event.currentTarget.parentNode.id.length)*1;
    console.log(sectionNum);
    console.log("#section"+sectionNum);
    sectionNum++;
    $("#"+event.currentTarget.parentNode.id).hide();
    if(sectionNum!=5){
        $("#section"+sectionNum).show();
    }else{
        $("#completed").show();
    }
    addProgress(sectionNum-1);
    event.preventDefault();
  });
});
function addProgress(progressNumber){
    $(".progress-bar").width((progressNumber*35)+"%");
    $(".step"+progressNumber).removeClass("stepNotDone");
    $(".step"+progressNumber).addClass("stepDone");
}*/
