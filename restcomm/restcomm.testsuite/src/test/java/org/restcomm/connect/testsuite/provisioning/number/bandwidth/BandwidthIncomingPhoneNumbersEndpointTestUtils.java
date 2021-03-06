/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2014, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */

package org.restcomm.connect.testsuite.provisioning.number.bandwidth;

/**
 * Created by sbarstow on 10/14/14.
 */
public class BandwidthIncomingPhoneNumbersEndpointTestUtils {
    public static String validOrderResponseXml="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><OrderResponse><Order><Name>A New Order</Name><OrderCreateDate>2014-10-14T17:58:15.299Z</OrderCreateDate><BackOrderRequested>false</BackOrderRequested><id>someid</id><ExistingTelephoneNumberOrderType><TelephoneNumberList><TelephoneNumber>4156902867</TelephoneNumber></TelephoneNumberList></ExistingTelephoneNumberOrderType><PartialAllowed>false</PartialAllowed><SiteId>2858</SiteId></Order></OrderResponse>";
    public static String jSonResultPurchaseNumber = "{\"sid\":\"PN*\",\"account_sid\":\"ACae6e420f425248d6a26948c17a9e2acf\",\"friendly_name\":\"My Company Line\",\"phone_number\":\"+14156902867\",\"voice_url\":\"http://demo.telestax.com/docs/voice.xml\",\"voice_method\":\"GET\",\"voice_fallback_url\":null,\"voice_fallback_method\":\"POST\",\"status_callback\":null,\"status_callback_method\":\"POST\",\"voice_caller_id_lookup\":false,\"voice_application_sid\":null,\"date_created\":\"*\",\"date_updated\":\"*\",\"sms_url\":null,\"sms_method\":\"POST\",\"sms_fallback_url\":null,\"sms_fallback_method\":\"POST\",\"sms_application_sid\":null,\"ussd_url\":null,\"ussd_method\":\"POST\",\"ussd_fallback_url\":null,\"ussd_fallback_method\":\"POST\",\"ussd_application_sid\":null,\"capabilities\":{\"voice_capable\":false,\"sms_capable\":false,\"mms_capable\":false,\"fax_capable\":false},\"api_version\":\"2012-04-24\",\"uri\":\"/restcomm/2012-04-24/Accounts/ACae6e420f425248d6a26948c17a9e2acf/IncomingPhoneNumbers/PN*.json\"}";
    public static String validDisconnectOrderResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><DisconnectTelephoneNumberOrderResponse><orderRequest><Name>Disconnect</Name><OrderCreateDate>2014-10-17T15:02:46.077Z</OrderCreateDate><id>disconnectId</id><DisconnectTelephoneNumberOrderType><TelephoneNumberList><TelephoneNumber>4156902867</TelephoneNumber></TelephoneNumberList><DisconnectMode>normal</DisconnectMode></DisconnectTelephoneNumberOrderType></orderRequest></DisconnectTelephoneNumberOrderResponse>";
    public static String jSonResultDeletePurchaseNumber = "{\"sid\":\"PN*\",\"account_sid\":\"ACae6e420f425248d6a26948c17a9e2acf\",\"friendly_name\":\"My Company Line\",\"phone_number\":\"+14156902867\",\"voice_url\":\"http://demo.telestax.com/docs/voice.xml\",\"voice_method\":\"GET\",\"voice_fallback_url\":null,\"voice_fallback_method\":\"POST\",\"status_callback\":null,\"status_callback_method\":\"POST\",\"voice_caller_id_lookup\":false,\"voice_application_sid\":null,\"date_created\":\"*\",\"date_updated\":\"*\",\"sms_url\":null,\"sms_method\":\"POST\",\"sms_fallback_url\":null,\"sms_fallback_method\":\"POST\",\"sms_application_sid\":null,\"ussd_url\":null,\"ussd_method\":\"POST\",\"ussd_fallback_url\":null,\"ussd_fallback_method\":\"POST\",\"ussd_application_sid\":null,\"capabilities\":{\"voice_capable\":false,\"sms_capable\":false,\"mms_capable\":false,\"fax_capable\":false},\"api_version\":\"2012-04-24\",\"uri\":\"/restcomm/2012-04-24/Accounts/ACae6e420f425248d6a26948c17a9e2acf/IncomingPhoneNumbers/PN*.json\"}";

    public static boolean match(String text, String pattern)
    {
        text = text.trim();
        pattern = pattern.trim();
        // Create the cards by splitting using a RegEx. If more speed
        // is desired, a simpler character based splitting can be done.
        String [] cards = pattern.split("\\*");

        // Iterate over the cards.
        for (String card : cards)
        {
            int idx = text.indexOf(card);

            // Card not detected in the text.
            if(idx == -1)
            {
                return false;
            }

            // Move ahead, towards the right of the text.
            text = text.substring(idx + card.length());
        }

        return true;
    }


}
