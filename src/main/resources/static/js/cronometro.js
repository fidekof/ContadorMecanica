
var clock;

$(document).ready(function () {

    clock = $('.clock-bahia1').FlipClock(1500, {
        countdown: true,
        clockFace: 'MinuteCounter'
    });
});

var clock2;

$(document).ready(function () {

    clock2 = $('.clock-bahia2').FlipClock(2100, {
        countdown: true,
        clockFace: 'MinuteCounter'
    });
});

