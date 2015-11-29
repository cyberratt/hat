var ChristmasLottery = function() {
    var init = function() {
        bindSubmitButton();
        hideResults();
    };

    var bindSubmitButton = function() {
        $('#submitName').on('click', function() {
            var name = $('#nameSelect').val();
            console.log(name);
            $.ajax({
                url: '/name',
                method: 'POST',
                data: { name: name }
            }).done(function(data) {
                $('#outputMessage').text("Your person is: " + data.name);
                showResults();
            });
        });
    };

    var hideResults = function() {
        $('.lotteryPick').hide();
    };

    var showResults = function() {
        $('.lotteryPick').show();
    };

    return {
        init: init
    }
}();

$(document).ready(function() {
    ChristmasLottery.init();
});