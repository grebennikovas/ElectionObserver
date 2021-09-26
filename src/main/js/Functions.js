function getData(url){
    fetch(url)
        .then(res => res.json())
        .then(
            (result) => {
                return result.items;
            },
            (error) => {
                return [];
            }
        )
}