package org.sereinfish;

import lombok.Setter;
import org.sereinfish.entity.Pixiv;

import java.io.IOException;

@Setter
public class SFPixiv {
    public static String api = "https://api.obfs.dev/api/pixiv/illust";
    //获取图片信息
    /**
     * 得到图片信息
     * @return
     */
    public static Pixiv getIllust(long uid) throws IOException {
        String json = SFUtil.getStr(api, "id=" + uid);
        Pixiv pixivEntity = SFUtil.toClass(json, Pixiv.class);

        return pixivEntity;
    }
}
