var learning = {

    // 59_InsertHTMLAtBeginingOfTheElement
    InsertElementAtBeginingOfTheElement: function(){
        $("p").prepend("<h1>This is Added by Jquery</h1>");
    },

    // 60_IsertMultipleElementAtBeginingAndEnd
    multipleInsertAtBeginingAndEnd: function(){
        var newHeading = "<h1>Important Note: Added by Jquery</h1>";
        var newParagraph = "<p> This is paragraph added by Jquery </p>";
        var value = $("body").append(newHeading, newParagraph);
    },

    // 61_InsertHTMLBeforeAndAfterElement
    insertHtmlBeforeAndAfterElement: function(){
        $("p").before("<h1>This is added by Jquery</h1>");
        $("p").after("<h1>This is adeed by Jquery</h1>")
    },

    // 62_InsertMultipleHTMLBeforeAndAfterElement
    insertMultipleHtmlBeforeAndAfterElement: function(){
        var headin1 = "<h1> This is added by Jquery 1</h1>";
        var headin2 = "<h1> This is added by Jquery 2</h1>";
        $("p").after(headin1,headin2);
    },

    // 63_WrapHTMLAroundAnElement
    wrapHtmlAroundElement: function(){
        $("p").wrap('<div class="wrapper"></div>');
    },

    //64_RemoveTheContentOfTheElement
    removeTheContentOfTheElement: function(){
        $("button").click(function(){
            $("div").empty();
        });
    },

    //65_RemoveParticularElement
    removeParticularElement: function(){
        $("button").click(function(){
            $("p").remove();
        });
    },

    //66_RemoveParentElementOfParticularElement
    removeParentElementOfParticularElement: function(){
        $("button").click(function(){
            $("p").unwrap();
        });
    },

    // 67_RemoveAttributeOfTheElement
    removeAttributeOfTheElement: function(){
        $("button").click(function(){
            $("p").removeAttr("style");
        });
    },

    // 68_AddSingleClassToTheElement
    addSingleClassToElement: function(){
        $("button").click(function(){
            $("p").addClass("CSS");
        });
    },

    //69_AddMultipleClassesToTheElement
    addMultipleClassToElement: function(){
        $("button").click(function(){
            $("p").addClass("col fon");
        });
    },

    // 70_RemoveClassOrMultipleClassesFromElement
    removeClassOrMultipleClassFromElement: function(){
        $("button").click(function(){
            $("p").removeClass("fon");
            $("p").removeClass("col pad")
        });
    },

    // 71_RemoveAllClassesAtOnce
    removeAllClassesAtOnce: function(){
        $("button").click(function(){
            $("p").removeClass();
        });
    },

    // 72_ToggleClassesOfElement
    toggleClassesOfElement: function(){
        $("button").click(function(){
            $("p").toggleClass("col");
        });
    },

    // 73_GetTheValueOfTheCSSProperties
    getValueOfCssProperty: function(){
        $("div").click(function(){
           var color =  $(this).css("background-color");
           $("#result").html(color);

        });
    },

    // 74_SetTheValueOfTheCSSProperties
    setTheValueOfTheCssPrperties: function(){
        $("div").click(function(){
            $(this).css("background-color","orange");
        });
    },

    //75_SetTheValueOfMultipleCSSProperties
    setTheValueOfMultipleCssPrperties: function(){
        $("div").click(function(){
            $(this).css({"background-color":"orange", "margin":"10px"})
        });
    },

    //76_GetTheHeightAndWidthOfTheElement
    getTheHeightAndWidthOfTheElement: function(){
        var height = $("div").height();
        var width = $("div").width();
        $("p").html('<b>Width : '+width+' Height : '+height+'</b>');
    },

    //77_SetTheWidthAndHeightOfTheElement
    setTheWidthAndHeightOfTheElement: function(){
        $("button").click(function(){
            $("div").height(500).width(500);
        });
    },

    // 78_GetInnerWidthAndHeightOfTheElement
    getInnerWidthAndHeightOfTheElement: function(){
        var width = $("div").innerWidth();
        var height = $("div").innerHeight();
        $("p").html('<b> Width: '+width+', Height: '+height+'</b>');
    },

    // 79_SetInnerWidthAndHeightOfTheElement
    setInnerWidthAndHeightOfTheElement: function(){
        $("button").click(function(){
            $("div").innerWidth(200).innerHeight(200);
        });
    },

    //80_GetOutterWidthAndHeightOfTheElement
    getOutterWidthAndHeightOfTheElement: function(){
        var width = $("div").outerWidth();
        var height = $("div").outerHeight();
        $("p").html('<b> Width: '+width+', Height: '+height+' </b>');
    },

    //81_GetOutterWidthANdHeightOfTheElementIncludingMarginArea
    getOutterWidthAndHeightOfTheElementIncludingMarginArea: function(){
        var width = $("div").outerHeight(true);
        var height = $("div").outerWidth(true);
        $("p").html('<b> Width: '+width+', Height: '+height+' </b>');     
    },

    //82_SetOuterWidthAndHeightOfTheElement
    setOuterWidthAndHeightOfTheElement: function(){
        $("button").click(function(){
            $("div").outerHeight(200).outerWidth(200);
        });
    },

    // 83_GetDirectParentElementOfElement
    getDirectParentElementOfElement: function(){
        $("li").parent().addClass("highlight");
    },

    // 84_GetAllAncestorsOfTheElement
    getAllAncestorsOfTheElement: function(){
        $("li").parents().addClass("frame");
    },

    // 85_GetTheSpecificAncestorOfTheElement
    getTheSpecificAncestorOfTheElement: function(){
        $("li").parents("div").addClass("frame");
    },

    // 86_GetAllAncestorsBetweenTwoElements
    getAllAncestorsBetweenTwoElements: function(){
        $("b").parentsUntil("ul").addClass("frame");
    },

    // 87_GetDirectChildrenOfTeElement
    getDirectChildrenOfTheElmenet: function(){
        $("ul").children().addClass("frame");
    },

    // 88_GetSpecificDescendentElementOfAnElement
    getSpecificDescendentElementOfElement: function(){
        $("ul").find("li").addClass("frame");
    },

    // 89_GetAllTheDescendentsOfTheElement
    getAllDescendentsOfTheElement: function(){
        $("div").find("*").addClass("frame");
    },

    // 90_GetALlTheSiblingsOfTheElement
    getAllTheSiblingsOfTheElement: function(){
        $("p").siblings().addClass("frame");
    },

    // 91_GetSpecificSiblingOfTheElement
    getSpecificSiblingOfTheElement: function(){
        $("p").siblings("h1").addClass("frame");
    },

    // 92_GetNextSiblingsOfTheElement
    getNextSiblingOfTheElement: function(){
        $("p").next().addClass("frame");
    },

    // 93_GetNextAllSiblingsOfTheElement
    getNextAllSiblingsOfTheElement: function(){
        $("p").nextAll().addClass("frame");
    },

    // 94_GetAllNextElementsBetweenTwoElements
    getAllNextElementsBetweenTwoElements: function(){
        $("p").nextUntil("li").addClass("frame");
    },

    // 95_GetPreviousSiblingOfTheElement
    getPreviousSiblingOfTheElement: function(){
        $("p").prev().addClass("frame");
    },

    // 96_GetAllPreviousSiblingsOfTheElement
    getAllPreviousSiblingsOfTheElement: function(){
        $("ul").prevAll().addClass("frame");
    },

    // 97_GetAllPreviousSiblingsBetweenTwoElements
    getAllPreviousSiblingsbetweenTwoElements: function(){
        $("ul").prevUntil("h1").addClass("frame");
    },

    // 98_SelectOnlyFirstElement
    selectOnlyFirstElement: function(){
        $("ul li").first().addClass("frame");
    },

    // 99_SelectOnlyLastElement
    selectOnlyLastElement: function(){
        $("ul li").last().addClass("frame");
    },

    //100_SelectElementByIndex
    selectElementByIndex: function(){
        $("ul li").eq(1).addClass("frame");
    },

    //101_SelectElementByNegativeIndex
    selectElementByNegativeIndex: function(){
        $("ul li").eq(-2).addClass("frame");
    },

    //102_FilterTheSelectionOfElementBySelector
    filterTheSelectionOfElementBySelectr: function(){
        $("ul li").filter(":even").addClass("frame");
    },

    //103_FilterTheSelectionOfTheEleemntUsingCustomFunction
    filterTheSelectionOfTheElementUsingCustomFunction: function(){
        $("ul li").filter(function(index){
            return index%2!==0;
        }).addClass("frame");
    },

    // 104_SelectTheElementThatHasSpecificChildElement
    selectTheElementThatHasSpecificChildElement:function(){
        $("div").has("ul").addClass("frame");
    },

    // 105_SelectTheElementThatDoesNotMatchTheCertainCondition
    selectTheEleemntThatDoesNotMatchTheCertainCondition: function(){
        $("ul li").not(":even").addClass("frame")
    },

    // 106_SelectTheElementByRangeOfTheIndices
    selectTheElementByRangeOfTheIndices: function(){
        $("ul li").slice(0,2).addClass("frame");
    },

    // 107_SelectTheElementByRangeOfNegativeIndices
    selectTheElementByRangeOfNegativeIndices: function(){
        $("ul li").slice(-3,-1).addClass("frame");
    },

    // 108_LoadContentInsideAnElement
    loadContentInsideAnElement: function(){
        $("button").click(function(){
            $("div").load("https://jsonplaceholder.typicode.com/todos/1");
        });
    },

    // 109_ExecuteTheCodeBasedUponLoadRequestResponse
    executeCodeBasedUponLoadRequestResponse: function(){
        $("button").click(function(){
            $("div").load("http://dummy.restapiexample.com/api/v1/employees", function(responseTxt, statusTxt, jqXHR){
                if(statusTxt == "success"){
                    alert("New Content has Loaded");
                }
                if(statusTxt == "error"){
                    alert("Error: "+jqXHR.status+ " "+ jqXHR.statusTxt);
                }
            });
        });
    },

    // 110_MakeAjaxRequestUsingGetMethod
    makeAjaxRequestUsingGetMethod: function(){
        $("button").click(function(){
            $.get("https://jsonplaceholder.typicode.com/todos/1", function(data){
                $("div").html(data);
            });
        });
    },

    // 111_ForEachInJquery
    forEachInJquery: function(){
        var obj = {
            "Name":"Shekhar",
            "Surname":"Arya"
        };
        var data = "";
        $.each(obj,function(fields,value){
            data += "</<div><p><b>"+fields+"</b></p> <p><b>"+value+"</b></p></div>" 
        });
        $("div").html(data);
        
    
    }
}