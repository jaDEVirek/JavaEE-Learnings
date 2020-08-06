function callMyAction() {
    $.ajax({
        type: "GET",
        url: "enterprise/getString",
        dataType: 'text',
        success: function (data) {
            alert(data);
        }
    });
}

