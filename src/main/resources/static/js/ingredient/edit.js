$(function() {
    function convert(arr) {
        var data = {};
        $.each(arr, function(i, obj) {
            data[obj.name] = obj.value;
        });
        return data;
    }

    $("form#ingredient").submit(function(e) {
        var arr = $(this).serializeArray();
        var data = convert(arr);

        var id = data.id;
        var url = "/api/ingredient/"+id;
        console.log(data);
        $.ajax({method:"PUT", url: url, data: JSON.stringify(data), contentType:"application/json; charset=utf-8", dataType:"json"}).done(function(data) {
            window.location = "../";
        }).fail(function(a, b, c) {
            window.alert("There was an error saving the ingredient.");
            console.log("Error saving ingredient:", a, b, c);
        });
        e.preventDefault();
    });
});