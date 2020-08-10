let counter = 0;

//setInterval("callMyAction()", 5000);


function callMyAction() {
    $.ajax({
        type: "GET",
        url: "enterprise/getString",
        dataType: 'text',
        success: function (data) {
            // lert(data);
            document.getElementById("pin").innerHTML = data + " " + counter;
            counter++;
            console.log(counter)
            console.log("tt")
            // $('#pin').load(location.href+'#pin');
        }
    });
}

function setIntervalAction(args) {
    callMyAction();
    setInterval(callMyAction, args);
}



