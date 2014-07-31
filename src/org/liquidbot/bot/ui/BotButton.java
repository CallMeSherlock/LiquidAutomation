package org.liquidbot.bot.ui;

import org.liquidbot.bot.utils.NetUtils;
import org.liquidbot.bot.utils.Utilities;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Kenneth on 7/29/2014.
 */
public class BotButton extends JButton {


    private Image buttonIcon;
    private Image buttonRollOverIcon;
    private Image buttonDisabledIcon;

    public BotButton(String imageURL, String imageName) {

        NetUtils.downloadFile(imageURL, Utilities.getContentDirectory() + "/resources/" + imageName);
        buttonIcon = Utilities.getLocalImage(Utilities.getContentDirectory() + "/resources/" + imageName);

        setIcon(new ImageIcon(buttonIcon));
        setBorderPainted(false);
        setMargin(new Insets(0, 0, 0, 0));
    }

    public void setButtonDisabledIcon(String imageURL, String imageName) {
        NetUtils.downloadFile(imageURL, Utilities.getContentDirectory() + "/resources/" + imageName);
        buttonDisabledIcon = Utilities.getLocalImage(Utilities.getContentDirectory() + "/resources/" + imageName);
        setDisabledIcon(new ImageIcon(buttonDisabledIcon));
    }

    public void setButtonRollOverIcon(String imageURL, String imageName) {
        NetUtils.downloadFile(imageURL, Utilities.getContentDirectory() + "/resources/" + imageName);
        buttonRollOverIcon = Utilities.getLocalImage(Utilities.getContentDirectory() + "/resources/" + imageName);
        setRolloverIcon(new ImageIcon(buttonRollOverIcon));
    }

}