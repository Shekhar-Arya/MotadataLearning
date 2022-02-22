var learning = {
    liSecondElemnt: function () {



        //     $("ul").bind('mouseenter',function(){

        // $("li[data-value='1']").click(function () {
        //     $("p").show();
        // });
        // $("li[data-value='3']").click(function () {
        //     $("p").hide();
        // });        
        //     });


        //     $(document).on('mouseenter',function(){
        //     $("li[data-value='1']").on('click',function () {
        //         $("p").show();
        //     });
        //     $("li[data-value='3']").on('click',function () {
        //         $("p").hide();
        //     });
        // });

        // function handler(event){
        //     var target = $(event.target);
        //     if(target.is("li[data-value='1']"))
        //     {
        //         $("p").show();
        //     }
        //     else if (target.is("li[data-value='3']")) {
        //         $("p").hide()
        //     }
        // }

        // $("ul").click(handler);

        // console.log($("ul").has("li"));

        $("ul").on("click", "li", function (event) {

            console.log($(event.target).data('value') === 1);
            if ($(event.target).data('value') === 1) {
                $("p").show();
            }
            else if ($(event.target).data('value') === 3) {
                $("p").hide();
            }

        });

        $('ul').html('<li data-value="1">This is Element 1</li><li data-value="2">This is Element 2</li><li data-value="3" >This is Element 3</li><li data-value="4">This is Element 4</li><li data-value="5">This is Element 5</li>');


        // eventBinding();
        // console.log($("ul").has("li"));

        // $("ul").click(function(e){
        //     console.log($(e.target).data('value')===1);
        //     console.log(e.target === $("li[data-value='1']"));
        //     if($(e.target).data('value')===1){
        //         $("p").hide();
        //     }
        // });



        // $("li").click(function(event){
        //     $(event.target).css("color","red");
        // });

        $("button").click(function () {

            var data = $("input[checked='checked']");
            console.log(data);
            $.each(data, function (i) {
                // var val = data.eq(i).data('value')
                var val = $(this).data('value');
                alert(val);
            })

        });
    }


}