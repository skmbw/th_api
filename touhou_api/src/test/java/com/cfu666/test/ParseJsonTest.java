package com.cfu666.test;

import com.vteba.utils.web.http.HttpTools;

public class ParseJsonTest {

	public static void main(String[] args) {
		String json = "{\"id\":\"1d7asdjas789as\",\"orgId\":\"1sdfjksahkuisayd\",\"paperId\":\"1sdasd34rdsd\",\"answerList\":[{\"questionId\":\"uisdysa7as6as7\",\"optionsList\":[\"A\",\"D\",\"E\"]},{\"questionId\":\"e455sdysa7as6gs7\",\"optionsList\":[\"B\",\"D\"]}]}";

		
		HttpTools.postJson("/jrt_api/paper/submit", json);
	}

}
