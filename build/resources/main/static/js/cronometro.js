let clockG1;
let clockG2;
let rutaG = '';
let tallerG = '', bahia1G = '', bahia2G = '';
let ordenActualBahia1G = '0';
let ordenActualBahia2G = '0';
const BAHIA1_CLASS_G = 'p-bahia-name-clock1' , BAHIA2_CLASS_G = 'p-bahia-name-clock2';
const URLCOLOROK = 'cronometroOK',URLCOLORALERT = 'cronometroALERT',  URLCOLORERROR = 'cronometroERROR';
const TIMEOKG = 300, MAXBAHIASG = 2, TIME35G=2100, TIME25G=1500, TIME35GP = 7*60, TIME25GP = 6*60 ;
let  canonicalURLG = '';
const timeByOrder = ntares => (ntares>1)?TIME35GP:TIME25GP;
const getBahiaCode = nBahia => (nBahia === 1)?bahia1G:bahia2G;
const getOrdenCode = nBahia => (nBahia === 1)?ordenActualBahia1G:ordenActualBahia2G;
const getUrlBahia = (bahia, nBahia) => {
    let url_bahia = '';
    const ordenActualBahia = (nBahia === 1)?ordenActualBahia1G:ordenActualBahia2G;
        if(ordenActualBahia === '0' || ordenActualBahia === null || ordenActualBahia.length === 0) url_bahia = `/tiempos/byOrdenId/${tallerG}/${bahia}`;
        else url_bahia = `/tiempos/byOrdenId/${tallerG}/${bahia}/${ordenActualBahia}`;
    return url_bahia;
};

const getCanonicalUrl = cssIdElement =>
{
    const elemento = document.getElementById(cssIdElement);
    const urlElemento = elemento.getAttribute("href");
    const urlTokens = urlElemento.split('/');
    urlTokens.pop();
    const canonicalUrl = urlTokens.join('/');
    return canonicalUrl;
};



const setBahiaName = (nBahia, bahiaName) =>
{
    const bahiaClass =  (nBahia>1)?BAHIA2_CLASS_G:BAHIA1_CLASS_G;
    const bahiaElement = document.querySelector(`.${bahiaClass}`);
    bahiaElement.innerHTML = `Bahia ${bahiaName}`;
};

const getAjaxValues = async (urlBahia) =>
{
    let ajaxB1 = new AjaxLibrary({ method: 'GET',
        url: urlBahia,
        asn: true,
        render: AjaxLibrary.JSON_RESULT});
    const responseB1 = await ajaxB1.AjaxGetResultType();
    console.log(responseB1);
    return responseB1;
};


const paintClock = (clock, elementoSigno, elementoReloj, nBahia) => {
    let cssUrlcolor = `${canonicalURLG}/${URLCOLOROK}${nBahia}.css`;
    const timeClock = nBahia>2?(TIMEOKG+1):clock.time.time;
    const countdown = clock.countdown;
    nBahia = nBahia>MAXBAHIASG?nBahia-MAXBAHIASG:nBahia;

    if(timeClock>TIMEOKG && countdown){
        cssUrlcolor = `${canonicalURLG}/${URLCOLOROK}${nBahia}.css`;
    }
    else{
        if(timeClock>0 && countdown){
            cssUrlcolor = `${canonicalURLG}/${URLCOLORALERT}${nBahia}.css`;
        }
        else {
            cssUrlcolor = `${canonicalURLG}/${URLCOLORERROR}${nBahia}.css`;
        }
    }

    const clockDigits = document.querySelector(`#css-theme${nBahia}`);
    clockDigits.setAttribute('href', cssUrlcolor);

};

const ValidarReloj = (clock, nBahia, elementoSigno ,elementoReloj) => {
    const timeClock = clock.time.time;
    const timeFlipClock = clock.countdown;
    if(timeClock<1 || timeFlipClock===false)
    {
         if(timeFlipClock)IniciarReloj(clock,0,false);
        addRemoveSigno('-',elementoSigno,true);

    }
    else
        {
            addRemoveSigno('-',elementoSigno,false);
        }
    paintClock(clock, elementoSigno, elementoReloj, nBahia);
};








const addRemoveSigno = (signo, elemento, flatSigno) =>
{
    if(flatSigno)elemento.innerHTML = signo;
    else elemento.innerHTML = '';
};

const ObtenerOrdenesDeBahias = async (nBahia) =>{
    const bahia = getBahiaCode(nBahia);
    const ordenA = getOrdenCode(nBahia);
    const urlBahia = getUrlBahia(bahia, nBahia);
    const responseAjax = await getAjaxValues(urlBahia);
    const clock = nBahia>1?clockG2:clockG1;
    const elementoSigno = document.querySelector(`.clock-signo${nBahia}`);
    const elementoReloj = document.querySelector(`.clock-bahia${nBahia}`);
    if(responseAjax !== null && responseAjax.length > 0)
    {
        const tiempo = timeByOrder(responseAjax.length);
        const ordenActualBahia = responseAjax[0];
        const ordenConsultada = ordenActualBahia.ordenId;
        if(ordenA === ordenConsultada){
            ValidarReloj(clock,nBahia,elementoSigno, elementoReloj);
        }
        else{

            IniciarReloj(clock,tiempo,true);
            setOrdenActualCode(nBahia,ordenConsultada);
        }
        setBahiaName(nBahia,bahia);
    }
    else{
        setOrdenActualCode(nBahia,'0');
        DetenerReloj(clock);
        addRemoveSigno('-',elementoSigno,false);
        paintClock(clock,elementoSigno,elementoReloj,nBahia+MAXBAHIASG);
    }
};

const setOrdenActualCode = (nBahia, codeOrden) => {
    if(nBahia===1) ordenActualBahia1G = codeOrden;
    else ordenActualBahia2G = codeOrden;
};


const ConsultarOrdenPorBahia = async () =>
{
    await ObtenerOrdenesDeBahias(1);
    await ObtenerOrdenesDeBahias(2);
};




const IniciarReloj = (clock,time, countDownFlat) =>
{
    clock.setTime(time);
    clock.setCountdown(countDownFlat);
    clock.start();
};


const DetenerReloj = clock =>
{
    clock.setTime(0);
    clock.countdown = true;
    clock.stop();
};





const ObtenerTallerYBahiasDesdeURL = () =>
{
    if(!rutaG) return 0;
    const tokens = rutaG.split('/');
    const taller = tokens[tokens.length - 2];
    const bahias = tokens[tokens.length - 1].split('_');
    tallerG = taller;
    if(bahias.length > 0){
        if(bahias.length>1)
        {
            bahia1G = bahias[0];
            bahia2G = bahias[1];
        }
        else
        {
            bahia1G = bahias[0];
            bahia2G = '0';
        }
    }
    else
    {
        bahia1G = '0';
        bahia2G = '0';
    }
    return 1;
};

const EjecutarPrograma = () => ConsultarOrdenPorBahia();

$(document).ready(function () {
    rutaG =  document.URL;
    canonicalURLG = getCanonicalUrl('crono-css');
    ObtenerTallerYBahiasDesdeURL();
    clockG1 = $('.clock-bahia1').FlipClock(0, {
        countdown: true,
        clockFace: 'MinuteCounter',
        autoStart: false,
        language: 'spanish'
    });

    clockG2 = $('.clock-bahia2').FlipClock(0, {
        countdown: true,
        clockFace: 'MinuteCounter',
        autoStart: false,
        language: 'spanish'
    });

    setInterval(EjecutarPrograma,15000);
});


