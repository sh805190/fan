package com.shawnown.app;

import static org.junit.Assert.assertEquals;

import com.shawnown.app.controller.fanController;
import com.shawnown.app.model.fan;
import com.shawnown.app.view.fanView;

import org.junit.Before;
import org.junit.Test;


public class AppTest 
{
    private fan model;
    private fanView view;
    private fanController controller;


    @Before
	public void setFan() throws Exception {
		model = new fan();
        view = new fanView();
        controller = new fanController(model, view);
        controller.setFan();
        
	}

    //test speed-up feature
	@Test
	public void testSpeedUp() {
		assertEquals(true, controller.getFanDirection());
		assertEquals(0, controller.getFanSpeed());

		controller.speedUp();
		assertEquals(1, controller.getFanSpeed());
		assertEquals(true, controller.getFanDirection());
        controller.updateView();
        controller.speedUp();
		assertEquals(2, controller.getFanSpeed());
		assertEquals(true, controller.getFanDirection());
        controller.updateView();
        controller.speedUp();
		assertEquals(3, controller.getFanSpeed());
		assertEquals(true, controller.getFanDirection());
        controller.updateView();
        controller.speedUp();
		assertEquals(0, controller.getFanSpeed());
		assertEquals(true, controller.getFanDirection());
        controller.updateView();
    }
    //test change direction feature
    @Test
	public void testDirection() {
		assertEquals(true, controller.getFanDirection());
		assertEquals(0, controller.getFanSpeed());

		controller.reverseDirection();;
		assertEquals(0, controller.getFanSpeed());
		assertEquals(false, controller.getFanDirection());
        controller.updateView();
        controller.reverseDirection();;
		assertEquals(0, controller.getFanSpeed());
		assertEquals(true, controller.getFanDirection());
        controller.updateView();
        controller.reverseDirection();;
		assertEquals(0, controller.getFanSpeed());
		assertEquals(false, controller.getFanDirection());
        controller.updateView();
    }
    //test all features
    @Test
	public void testAll() {
		assertEquals(true, controller.getFanDirection());
		assertEquals(0, controller.getFanSpeed());

		controller.reverseDirection();;
		assertEquals(0, controller.getFanSpeed());
		assertEquals(false, controller.getFanDirection());
        controller.updateView();
        controller.reverseDirection();;
		assertEquals(0, controller.getFanSpeed());
		assertEquals(true, controller.getFanDirection());
        controller.updateView();
        controller.reverseDirection();;
		assertEquals(0, controller.getFanSpeed());
		assertEquals(false, controller.getFanDirection());
        controller.updateView();
        controller.speedUp();
		assertEquals(1, controller.getFanSpeed());
		assertEquals(false, controller.getFanDirection());
        controller.updateView();
        controller.speedUp();
		assertEquals(2, controller.getFanSpeed());
		assertEquals(false, controller.getFanDirection());
        controller.updateView();
        controller.speedUp();
		assertEquals(3, controller.getFanSpeed());
		assertEquals(false, controller.getFanDirection());
        controller.updateView();
        controller.speedUp();
		assertEquals(0, controller.getFanSpeed());
		assertEquals(false, controller.getFanDirection());
        controller.updateView();
    }



}
