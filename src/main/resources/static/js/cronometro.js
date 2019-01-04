let clock;
let clock2;

const ConsultarOrdenPorBahia = (bahia, taller)
{

}

$(document).ready(function () {

    clock = $('.clock-bahia1').FlipClock(1500, {
        countdown: true,
        clockFace: 'MinuteCounter'
    });

    clock2 = $('.clock-bahia2').FlipClock(2100, {
        countdown: true,
        clockFace: 'MinuteCounter'
    });
});


