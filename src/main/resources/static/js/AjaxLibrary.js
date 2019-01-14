class AjaxLibrary {

    constructor(parametros){
        if (parametros)this.parametros = parametros;
        else this.parametros = {
            method: 'GET',
            url: '',
            asn: true,
            header: '',
            render: AjaxLibrary.TEXT_RESULT
        };
    }

    static get JSON_RESULT(){return "JSON"};
    static get TEXT_RESULT(){return "TEXT"};

    AjaxGet()
    {
        return new Promise((resolve, reject) => {
            const xhr = new XMLHttpRequest();
            xhr.open(this.parametros.method, this.parametros.url, this.parametros.asn);
            xhr.addEventListener("load", e => {resolve(e.target);});
            xhr.send();
        });
    }

    async AjaxGetResultType()
    {
        let result = null;
        const response = await this.AjaxGet();
        switch (response.status) {
            case 200: {
                result = response.responseText;
                break;
            }
            case 400: {
                console.log('Error de cliente: ' + response.status);
                break;
            }
            default:
                console.log('Error Desconocido: ' + response.status);
        }


        if(result!==null)
        switch(this.parametros.render)
        {
            case AjaxLibrary.JSON_RESULT:
            {
                return JSON.parse(result);
            }
        }
        return result;
    }
}