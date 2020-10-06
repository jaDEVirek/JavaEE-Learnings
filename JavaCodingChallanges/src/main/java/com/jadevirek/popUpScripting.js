
$(document).ready(function() {
    var id = '#dialog';
    var maskHeight = $(document).height();
    var maskWidth = $(window).width();
    $('#mask').css({'width':maskWidth,'height':maskHeight});
    $('#mask').fadeIn(500);
    $('#mask').fadeTo("slow",0.9);
    var winH = $(window).height();
    var winW = $(window).width();
    $(id).css('top',  winH/2-$(id).height()/2);
    $(id).css('left', winW/2-$(id).width()/2);
    $(id).fadeIn(2000);
    $('.window .close').click(function (e) {
        e.preventDefault();
        $('#mask').hide();
        $('.window').hide();
    });
    $('#mask').click(function () {
        $(this).hide();
        $('.window').hide();
    });

});

/**
 * APPLY
 To taki helper składający tablicę w argumenty funkcji, który
 również jako parametr przyjmuje nowy obiekt, a ten stanie się this w tej właśnie funkcji.
**/

var myCats = function (cat1, cat2) {
    console.log('I am ' + this.name + ' and my cats are: ' + cat1 + ' and ' + cat2);
};

var me = {
    name: 'Krzysztof'
};

var cats = ['Filemon', 'Mruczek'];

myCats.apply(me, cats);

/**
 * BIND
 Jest to bardzo podobna funkcja do call() z tą różnicą, że pozwala na “przechowanie”
 funkcji z nowym kontekstem w postaci zmiennej, aby móc ją na przykład przekazać dalej jako parametr funkcji.
 **/
var meow = function () {
    console.log('I am a cat ' + this.name);
};

var filemon = {
    name: 'Filemon'
};

var mruczek = {
    name: 'Mruczek'
};

var filemonMeow = meow.bind(filemon);
filemonMeow();
// I am a cat Filemon

var mruczekMeow = meow.bind(mruczek);
mruczekMeow()
// I am a cat Mruczek

/**
 call()
 Oprócz operowania obiektami i zasadą “kropki” istnieją inne metody (pewne 3 funkcje), które pozwalają na zmianę kontekstu wywołania dowolnej funkcji.
 Pozwala na wywołanie funkcji z konkretnym kontekstem przekazanym jako argument.
 **/
