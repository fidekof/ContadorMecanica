class AjaxLibrary {
    static POST_METHOD = 'POST';
    static GET_METHOD = 'GET' ;
    static ASYNC = true;

    constructor(parametros){
        if (parametros)this.parametros = parametros;
        else this.parametros = {
            method: AjaxLibrary.GET_METHOD,
            url: '\\',
            asnyc: AjaxLibrary.ASYNC
        };
    }

    ajax()
    {
        return new Promise((resolve, reject) => {
            const xhr = new XMLHttpRequest();
            xhr.open(this.parametros.method, this.parametros.url, this.parametros.asnyc);
            xhr.addEventListener("load", e => {
                resolve(e.target);
            });
            xhr.send();
        })
    }

}