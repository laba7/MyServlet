
    $('.car').on("click", function getUser(URL){

        var str = $(this).serialize();
        $.ajax({
        url: URL,
        type:"GET",
//        data:("carBrand" + $("#brand.idBrand").val()),
        dataType: "text",

        success: function (response) {
        console.log('Success', arguments);
        }


});
});



