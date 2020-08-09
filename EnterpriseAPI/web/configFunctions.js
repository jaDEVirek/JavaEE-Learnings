let counter=0;
setInterval("callMyAction();", 5000);
function callMyAction() {
    $.ajax({
        type: "GET",
        url: "enterprise/getString",
        dataType: 'text',
        success: function (data) {
            // lert(data);
            document.getElementById("pin").innerHTML = data + " "+counter;
            console.log("refresh ")
            counter++;
            console.log(counter)
            // $('#pin').load(location.href+'#pin');
        }
    });
}

